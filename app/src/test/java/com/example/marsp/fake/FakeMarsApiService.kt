package com.example.marsp.fake

import com.example.marsp.model.MarsPhoto
import com.example.marsp.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
