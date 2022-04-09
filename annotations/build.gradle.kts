plugins {
    java
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("mavenLocal") {
            artifactId = "annotations"
            version = rootProject.extra.get("release") as String
            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.compileJava {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}

tasks.compileKotlin {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()

    kotlinOptions {
        jvmTarget = "17"
        apiVersion = "1.6"
        languageVersion = "1.6"
    }
}
