package com.venu.mvvm_architecture_kotlin.data.room.dao;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.venu.mvvm_architecture_kotlin.data.room.entities.Sample;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public final class SampleDao_Impl implements SampleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSample;

  public SampleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSample = new EntityInsertionAdapter<Sample>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Sample`(`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Sample value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public long insert(Sample sample) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSample.insertAndReturnId(sample);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }
}
