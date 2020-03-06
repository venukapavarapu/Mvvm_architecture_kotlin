package com.venu.mvvm_architecture_kotlin.data.room

import androidx.room.RoomMasterTable.TABLE_NAME
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class Migration1To2 : Migration(4,5) {
    override fun migrate(database: SupportSQLiteDatabase) {
        val TABLE_NAME_TEMP = "versions"

      /*  // 1. Create new table
        database.execSQL("CREATE TABLE IF NOT EXISTS `$TABLE_NAME_TEMP` " +
                "(`id` TEXT NOT NULL, " +
                "PRIMARY KEY(`id`))")*/


        database.execSQL("DROP TABLE IF EXISTS `versions` ");

        database.execSQL("CREATE TABLE `versions` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `apiLevel` TEXT NOT NULL, "+
                "PRIMARY KEY(`id`))")



        /*// 2. Copy the data
        database.execSQL("INSERT INTO $TABLE_NAME_TEMP (id) "
                + "SELECT id "
                + "FROM $TABLE_NAME")

        // 3. Remove the old table
        database.execSQL("DROP TABLE $TABLE_NAME")

        // 4. Change the table name to the correct one
        database.execSQL("ALTER TABLE $TABLE_NAME_TEMP RENAME TO $TABLE_NAME")*/
    }
}