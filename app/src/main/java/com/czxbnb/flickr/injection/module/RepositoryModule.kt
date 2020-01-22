package com.czxbnb.flickr.injection.module

import com.czxbnb.flickr.models.post.PostRepository
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object RepositoryModule {
    /**
     * Provides the Item repository implementation.
     * @return the Item repository implementation.
     */
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideItemRepository(): PostRepository {
        return PostRepository.getInstance()
    }
}