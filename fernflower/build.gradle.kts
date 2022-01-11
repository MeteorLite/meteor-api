plugins {
    java
}

group "org.meteorlite"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.runelite.net") }
    maven { url = uri("https://raw.githubusercontent.com/open-osrs/hosting/master") }
}

dependencies {
    implementation(project(":openosrs-injector"))
    implementation(project(":meteor-logger"))
}

tasks.test {
    useJUnitPlatform()
}
