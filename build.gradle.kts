import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "${Dependencies.kotlin.versions.kotlin}"
	kotlin("plugin.serialization") version "${Dependencies.kotlin.versions.kotlin}"
}

allprojects {
	version = "0.0.1-SNAPSHOT"

	apply {
		plugin("org.jetbrains.kotlin.jvm")
		plugin("kotlinx-serialization")
		plugin("idea")

	}

	dependencies {
		implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
		implementation(Dependencies.kotlin.standardLibrary)
		implementation(Dependencies.kotlin.coroutinesCore)
		implementation(Dependencies.kotlin.coroutinesJDK8)
		implementation(Dependencies.kotlin.serialization)
		implementation(Dependencies.kotlin.slf4j)

		//Logging
		implementation(Dependencies.logging.microUtils)
		implementation(Dependencies.logging.slf4j)


		//JUnit
		testImplementation(Dependencies.testing.jUnitApi)
		testRuntimeOnly(Dependencies.testing.jUnitEngine)
		testRuntimeOnly(Dependencies.testing.jUnitConsole)
		testImplementation(Dependencies.testing.mockito)
		testImplementation(Dependencies.testing.kotlinAssertions)
		testImplementation(Dependencies.testing.kotlinCore)
		testImplementation(Dependencies.testing.kotlinRunner)
	}

	repositories {
		jcenter()
		mavenCentral()
		gradlePluginPortal()
	}

	tasks.withType<Test> {
		useJUnitPlatform { }
	}

	configurations {
		all {
			//removing logback to add slf4j
			exclude(group = "ch.qos.logback", module = "logback-classic")
		}
	}

	val compileKotlin: KotlinCompile by tasks
	compileKotlin.kotlinOptions {
		jvmTarget = "${Dependencies.versions.jvmTarget}"
	}
	val compileTestKotlin: KotlinCompile by tasks
	compileTestKotlin.kotlinOptions {
		jvmTarget = "${Dependencies.versions.jvmTarget}"
	}
}
dependencies {
	implementation(kotlin("stdlib-jdk8"))
}
repositories {
	mavenCentral()
}