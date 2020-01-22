package com.czxbnb.flickr.ui.component

import com.czxbnb.flickr.injection.module.ApiModule
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


}