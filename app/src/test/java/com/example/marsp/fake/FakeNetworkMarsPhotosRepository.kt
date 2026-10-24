package com.example.marsp.fake

import com.example.marsp.data.MarsPhotosRepository
import com.example.marsp.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
