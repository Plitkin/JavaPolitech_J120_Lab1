package PhoneNumber_1;

import java.util.Objects;

public class PhoneNumber {
    private String regionCode;
    private String localNumber;

    public PhoneNumber(String regionCode, String localNumber) {
        if (!isValidNumber(regionCode) || !isValidNumber(localNumber)) {
            throw new IllegalArgumentException("Invalid region code or local number");
        }
        this.regionCode = regionCode;
        this.localNumber = localNumber;
    }

    private boolean isValidNumber(String numberPart) {
        // Проверка, что строка состоит только из цифр
        return numberPart.matches("\\d+");
    }

    @Override
    public String toString() {
        // Представление номера в виде строки с форматированием
        return "(" + regionCode + ")" + localNumber.replaceAll("(\\d{2,3})(\\d{2})(\\d{2})", "$1-$2-$3");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhoneNumber that = (PhoneNumber) obj;
        return Objects.equals(regionCode, that.regionCode) && Objects.equals(localNumber, that.localNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode, localNumber);
    }
}

