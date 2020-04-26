plugins {
    kotlin("jvm") version "1.3.71"
    antlr
}

group = "org.lingua-machina.klingua-machina"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    antlr("org.antlr:antlr4:4.8")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.1")
    implementation(kotlin("reflect"))
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
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    generateGrammarSource {
        // TODO
    }
}