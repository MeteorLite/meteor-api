import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
    java
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

group = "meteor"
val release by rootProject.extra { "1.0.0" }

repositories{
    mavenCentral()
}
dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter-api:_")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(kotlin("stdlib-jdk8"))
}
tasks {
    processResources {
        dependsOn(findByPath(":scripts:assembleScripts"))
        from("scripts/build/scripts")
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenLocal") {
            artifactId = "scripts"
            version = release
            from(components["java"])
        }
    }
}

tasks.test{
    useJUnitPlatform()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}