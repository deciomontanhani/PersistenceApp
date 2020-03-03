package br.com.deciomontanhani.demopersistencia.bancodedados.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.deciomontanhani.demopersistencia.bancodedados.entity.Word

@Dao
interface WordDao {

    @Query("SELECT * from word_table ORDER BY word COLLATE NOCASE ASC")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}