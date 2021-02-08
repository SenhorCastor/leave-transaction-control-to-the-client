package io.usecases

import io.entities.Story
import io.usecases.repos.MemberRepo
import io.usecases.repos.StoryRepo
import io.entities.Member

class WriteStoryUseCase(private val memberRepo: MemberRepo, private val storyRepo: StoryRepo) {
    fun execute(story: Story, member: Member) {
        val transaction = storyRepo.save(story);
        val memberUpdated = member.incrementStoriesWrittenCount()
        val transactionAfterMemberSave =  memberRepo.save(memberUpdated, transaction)
        transactionAfterMemberSave.commit()
    }
}