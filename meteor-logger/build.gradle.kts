plugins {
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("mavenLocal") {
            artifactId = "logger"
            version = rootProject.extra.get("release") as String
            from(components["java"])
        }
    }
}

dependencies {

}

tasks.test {
    useJUnitPlatform()
}