plugins {
    kotlin("jvm") version "1.3.72"
    application
    distribution
}

group = "org.lingua-machina.klingua-machina"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClassName = "cli.MainKt"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.antlr:antlr4:4.8")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.1")
}

tasks {
    test {
        useJUnitPlatform()

        testLogging {
            events("passed", "skipped", "failed")
        }
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-XXLanguage:+NewInference"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-XXLanguage:+NewInference"
    }
}