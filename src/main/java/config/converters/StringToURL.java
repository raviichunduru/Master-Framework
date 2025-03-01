package config.converters;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;
import java.net.URL;

public class StringToURL implements Converter<URL> {

  @SneakyThrows
  @Override
  public URL convert(Method method, String stringURL) {
    return new URL(stringURL);
  }
}
