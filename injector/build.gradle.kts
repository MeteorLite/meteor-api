plugins{
    java
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories{
    mavenCentral()
    maven { url = uri("https://repo.runelite.com")}
    maven { url = uri("https://raw.githubusercontent.com/open-osrs/hosting/master")}
}

publishing {
    publications {
        create<MavenPublication>("mavenLocal") {
            artifactId = "injected"
            version = rootProject.extra.get("release") as String
            artifact(file("./build/injected/injected-client.jar"))
        }
    }
}



dependencies{
    compileOnly("org.projectlombok:lombok:_")
    annotationProcessor("org.projectlombok:lombok:_")
    implementation(gradleApi())

    implementation(project(":deobfuscator"))
    implementation(project(":api-rs"))
    implementation(project(":osrs"))
    implementation(project(":logger"))

    implementation(group = "org.ow2.asm", name = "asm", version = "8.0.1")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "8.0.1")
    implementation(group = "org.jetbrains", name = "annotations", version = "19.0.0")
    implementation(group = "com.google.guava", name = "guava", version = "23.2-jre")
    implementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.1")

}

tasks{
    test {
        useJUnitPlatform()
    }
    register<JavaExec>("inject"){
        classpath(sourceSets["main"].runtimeClasspath)
        mainClass.set("com.openosrs.injector.Injector")
        dependsOn(":mixins:jar")
    }
    findByName("publishMavenLocalPublicationToMavenLocal")!!.dependsOn("inject")
    findByName("build")!!.finalizedBy("inject")
}


