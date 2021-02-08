group = "io.app"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.app")
}

dependencies {
    implementation(Dependencies.mongo.kMongo)

    implementation(project(":usecases"))
    implementation(project(":entities"))
    implementation(project(":transaction"))
    implementation(project(":repos"))
}
