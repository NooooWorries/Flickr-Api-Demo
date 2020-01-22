package com.czxbnb.flickr.injection.component

import com.czxbnb.flickr.injection.module.RepositoryModule
import com.czxbnb.flickr.ui.MainViewModel
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

    fun inject(mainViewModel: MainViewModel)
}