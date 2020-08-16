package com.venu.mvvm_architecture_kotlin.data.room.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao;
import com.venu.mvvm_architecture_kotlin.data.room.dao.SampleDao_Impl;
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao;
import com.venu.mvvm_architecture_kotlin.data.room.dao.UserDao_Impl;
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao;
import com.venu.mvvm_architecture_kotlin.data.room.dao.VersionsDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class DBHelper_Impl extends DBHelper {
  private volatile UserDao _userDao;

  private volatile SampleDao _sampleDao;

  private volatile VersionsDao _versionsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`login` TEXT NOT NULL, `avatarUrl` TEXT, `name` TEXT, `company` TEXT, `reposUrl` TEXT, `blog` TEXT, PRIMARY KEY(`login`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Sample` (`id` TEXT NOT NULL, `name` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `versions` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `apiLevel` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c6b37ff4c55fbd29e5f23e113a56ca9d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `Sample`");
        _db.execSQL("DROP TABLE IF EXISTS `versions`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(6);
        _columnsUser.put("login", new TableInfo.Column("login", "TEXT", true, 1));
        _columnsUser.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsUser.put("company", new TableInfo.Column("company", "TEXT", false, 0));
        _columnsUser.put("reposUrl", new TableInfo.Column("reposUrl", "TEXT", false, 0));
        _columnsUser.put("blog", new TableInfo.Column("blog", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle User(com.venu.mvvm_architecture_kotlin.data.room.entities.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsSample = new HashMap<String, TableInfo.Column>(2);
        _columnsSample.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsSample.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSample = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSample = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSample = new TableInfo("Sample", _columnsSample, _foreignKeysSample, _indicesSample);
        final TableInfo _existingSample = TableInfo.read(_db, "Sample");
        if (! _infoSample.equals(_existingSample)) {
          throw new IllegalStateException("Migration didn't properly handle Sample(com.venu.mvvm_architecture_kotlin.data.room.entities.Sample).\n"
                  + " Expected:\n" + _infoSample + "\n"
                  + " Found:\n" + _existingSample);
        }
        final HashMap<String, TableInfo.Column> _columnsVersions = new HashMap<String, TableInfo.Column>(3);
        _columnsVersions.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsVersions.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsVersions.put("apiLevel", new TableInfo.Column("apiLevel", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVersions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVersions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVersions = new TableInfo("versions", _columnsVersions, _foreignKeysVersions, _indicesVersions);
        final TableInfo _existingVersions = TableInfo.read(_db, "versions");
        if (! _infoVersions.equals(_existingVersions)) {
          throw new IllegalStateException("Migration didn't properly handle versions(com.venu.mvvm_architecture_kotlin.data.room.entities.Versions).\n"
                  + " Expected:\n" + _infoVersions + "\n"
                  + " Found:\n" + _existingVersions);
        }
      }
    }, "c6b37ff4c55fbd29e5f23e113a56ca9d", "769f047a6209874931193a7b7e33f8c7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "User","Sample","versions");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `Sample`");
      _db.execSQL("DELETE FROM `versions`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public SampleDao sampleDao() {
    if (_sampleDao != null) {
      return _sampleDao;
    } else {
      synchronized(this) {
        if(_sampleDao == null) {
          _sampleDao = new SampleDao_Impl(this);
        }
        return _sampleDao;
      }
    }
  }

  @Override
  public VersionsDao versionsDao() {
    if (_versionsDao != null) {
      return _versionsDao;
    } else {
      synchronized(this) {
        if(_versionsDao == null) {
          _versionsDao = new VersionsDao_Impl(this);
        }
        return _versionsDao;
      }
    }
  }
}
