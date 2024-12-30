package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.techfathers.mechanic_adda.DataBinderMapperImpl());
  }
}
