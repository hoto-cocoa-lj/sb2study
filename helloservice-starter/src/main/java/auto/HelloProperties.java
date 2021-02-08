package auto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello.service")
public class HelloProperties {
    String prefix;
    String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
