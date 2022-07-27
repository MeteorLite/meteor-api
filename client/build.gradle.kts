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
    implementation(project(":logger"))
    implementation("org.rationalityfrontline:kevent:2.1.4")
    implementation(group = "org.bouncycastle", name = "bcprov-jdk15on", version = "1.52")
    runtimeOnly(files("./src/main/resources/injected-client.osrs"))
}

tasks {
    register<JavaExec>("runClient") {
        dependsOn(":injector:inject")
        classpath(sourceSets["main"].runtimeClasspath)
        mainClass.set("osnet.OSNetClient")
        jvmArgs("-noverify")
    }
}

tasks.test {
    useJUnitPlatform()
}