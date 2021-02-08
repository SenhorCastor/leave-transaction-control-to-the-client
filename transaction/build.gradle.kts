group = "io.transaction"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.transaction")
}

dependencies {
    implementation(Dependencies.mongo.kMongo)

    implementation(project(":usecases"))
    implementation(project(":entities"))
}
