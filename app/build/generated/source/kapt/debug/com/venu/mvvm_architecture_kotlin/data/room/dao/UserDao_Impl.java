package com.venu.mvvm_architecture_kotlin.data.room.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.venu.mvvm_architecture_kotlin.data.room.entities.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User`(`login`,`avatarUrl`,`name`,`company`,`reposUrl`,`blog`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getLogin() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLogin());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvatarUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getCompany() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCompany());
        }
        if (value.getReposUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getReposUrl());
        }
        if (value.getBlog() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBlog());
        }
      }
    };
  }

  @Override
  public void insert(User user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<User> findByLogin(String login) {
    final String _sql = "SELECT * FROM user WHERE login = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (login == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, login);
    }
    return new ComputableLiveData<User>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected User compute() {
        if (_observer == null) {
          _observer = new Observer("user") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("login");
          final int _cursorIndexOfAvatarUrl = _cursor.getColumnIndexOrThrow("avatarUrl");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfCompany = _cursor.getColumnIndexOrThrow("company");
          final int _cursorIndexOfReposUrl = _cursor.getColumnIndexOrThrow("reposUrl");
          final int _cursorIndexOfBlog = _cursor.getColumnIndexOrThrow("blog");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpLogin;
            _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            final String _tmpAvatarUrl;
            _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCompany;
            _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
            final String _tmpReposUrl;
            _tmpReposUrl = _cursor.getString(_cursorIndexOfReposUrl);
            final String _tmpBlog;
            _tmpBlog = _cursor.getString(_cursorIndexOfBlog);
            _result = new User(_tmpLogin,_tmpAvatarUrl,_tmpName,_tmpCompany,_tmpReposUrl,_tmpBlog);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
