package com.czxbnb.flickr.ui.component

import com.czxbnb.flickr.ui.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(RepositoryModule::class)])
interface ViewModelComponent {
    @Component.Builder
    interface Builder {
        fun build() : ViewModelComponent

        fun repositoryModule (repositoryModule: RepositoryModule): Builder
    }
}