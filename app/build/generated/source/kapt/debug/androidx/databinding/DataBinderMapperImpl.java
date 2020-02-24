package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.venu.mvvm_architecture_kotlin.DataBinderMapperImpl());
  }
}
