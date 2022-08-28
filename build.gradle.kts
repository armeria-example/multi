plugins {
	kotlin("jvm") version "1.5.10"
	id("com.google.protobuf") version "0.8.15"
}

allprojects {
	group = "multi"
	version = "0.0.1-SNAPSHOT"

	apply(plugin = "kotlin")

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
	}
}
