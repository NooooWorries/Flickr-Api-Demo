package com.czxbnb.flickr.injection.component

import com.czxbnb.flickr.injection.module.ApiModule
import com.czxbnb.flickr.models.post.PostRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApiModule::class)])
interface RepositoryComponent {
    @Component.Builder
    interface Builder {
        fun build(): RepositoryComponent

        fun apiModule(apiModule: ApiModule): Builder
    }

    /**
     * Injects required dependencies into the specified postRepository
     * @param postRepository postRepository in which to inject the dependencies
     */
    fun inject(postRepository: PostRepository)
}