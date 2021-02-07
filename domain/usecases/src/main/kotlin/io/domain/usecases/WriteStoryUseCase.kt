package io.domain.usecases

import io.domain.entities.Member
import io.domain.entities.Story
import io.domain.usecases.repos.MemberRepo
import io.domain.usecases.repos.StoryRepo

class WriteStoryUseCase(private val memberRepo: MemberRepo, private val storyRepo: StoryRepo) {
    fun execute(story: Story, member: Member) {
        val transaction = storyRepo.save(story);
        val memberUpdated = member.incrementStoriesWrittenCount()
        val transactionAfterMemberSave =  memberRepo.save(memberUpdated, transaction)
        transactionAfterMemberSave.commit()
    }
}