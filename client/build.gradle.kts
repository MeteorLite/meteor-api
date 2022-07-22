plugins {
    kotlin("jvm")
}

group = "org.meteorlite"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
    maven { url = uri("https://repo.runelite.net") }
    maven { url = uri("https://raw.githubusercontent.com/open-osrs/hosting/master") }
}

dependencies {
    implementation(project(":api"))
    implementation(project(":api-rs"))
    implementation("org.rationalityfrontline:kevent:2.1.4")
    runtimeOnly(files("./injector/build/injected/injected-client.jar"))
    runtimeOnly(files("../injector/build/injected/injected-client.jar"))
}

tasks {
    register<JavaExec>("runClient") {
        dependsOn(":injector:inject")
        classpath(sourceSets["main"].runtimeClasspath)
        mainClass.set("osnet.OSNetClient")
    }
}

tasks.test {
    useJUnitPlatform()
}