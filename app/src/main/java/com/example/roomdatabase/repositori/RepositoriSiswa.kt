package com.example.roomdatabase.repositori

import com.example.roomdatabase.room.Siswa
import com.example.roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream() : Flow<List<Siswa>>

    suspend fun  insertSiswa(Siswa: Siswa)
}

class OfflineReportSiswa(
    private val SiswaDao: SiswaDao
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = SiswaDao
        .getAllSiswa()

    override suspend fun insertSiswa(siswa: Siswa) = SiswaDao
        .insert(siswa)
}