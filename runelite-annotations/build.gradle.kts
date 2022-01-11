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
tasks{
    compileKotlin{
        kotlinOptions{
            jvmTarget = "1.8"
        }
    }
    compileTestKotlin{
        kotlinOptions{
            jvmTarget = "1.8"
        }
    }


    test{
        useJUnitPlatform()
    }
}
