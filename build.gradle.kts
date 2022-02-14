import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
    java
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

group = "meteor"
val release by rootProject.extra { "1.0.8" }

repositories{
    mavenCentral()
    mavenLocal()
}
dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter-api:_")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(kotlin("stdlib-jdk8"))
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

tasks {
    processResources {
        dependsOn(findByPath(":scripts:assembleScripts"))
        from("scripts/build/scripts")
    }
    test {
        useJUnitPlatform()
    }
    compileKotlin{
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}