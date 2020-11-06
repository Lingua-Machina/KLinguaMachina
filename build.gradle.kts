plugins {
    kotlin("jvm") version "1.4.20-RC"
    application
    distribution
}

group = "org.linguamachina.klinguamachina"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("org.linguamachina.klinguamachina.cli.MainKt")
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
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }
}