import io.entities.Member
import io.entities.Story
import io.repos.MemberRepoMongo
import io.repos.StoryRepoMongo
import io.usecases.WriteStoryUseCase
import io.usecases.repos.MemberRepo
import io.usecases.repos.StoryRepo
import org.litote.kmongo.KMongo
import java.util.*

class App {
    fun route() {
        val mongoClient = KMongo.createClient("mongodb://localhost:27017/?retryWrites=false")
        val memberRepo: MemberRepo = MemberRepoMongo(mongoClient)
        val storyRepo: StoryRepo = StoryRepoMongo(mongoClient)
        val story = Story(UUID.randomUUID(), "leave transaction control to the client")
        val member = Member(UUID.randomUUID(), "fernando", 1)
        val useCase = WriteStoryUseCase(memberRepo, storyRepo)
        useCase.execute(story, member)
    }
}