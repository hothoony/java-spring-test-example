package study.optionaltest;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class orElse {
    
    /**
     * Optional.ofNullable(값).orElse(대체값);
     * - 값이 있으면 값을 반환
     * - 값이 없으면 대체값을 반환
     */

    @Test
    void orElse_null() {
        Optional<String> optional = Optional.ofNullable(null);
        
        assertThat(optional.orElse(null)).isNull();
    }

    @Test
    void orElse_notNull() {
        Optional<String> optional = Optional.ofNullable("");
        
        assertThat(optional.orElse(null)).isNotNull();
    }
}
