package com.codestorm.springvalidations;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Student(@NotNull(message = "Id must not be null") Long id,
                      @NotBlank(message = "Name should not be null or empty")
                      @Size(min = 5, max = 50, message = "Min letters are 5 and max are 50") String name,
                      @NotEmpty(message = "Subjects list must not be empty") List<String> subjects,
                      @Min(value = 18, message = "Minimum age is 18")
                      @Max(value = 100, message = "Maximum age is 100") int age,
                      @Email(message = "Invalid Email ID") String email,
                      @Past(message = "Joined date should be past")  LocalDateTime admissionDate,
                      @Future(message = "Expected promotion should be future") LocalDateTime nextClassPromotedDate,
                      @NotBlank(message = "Should not be blank")
                      @Pattern(regexp = "^REG\\d{2,10}$") String rollNumber,
                      @Digits(integer = 5, fraction = 2, message = "Fees must be a number with at most 5 integer digits and 2 decimal digits")
                      @Positive(message = "Fees should be positive") BigDecimal tuitionFees,
                      @DecimalMax(value = "-1.5", message = "Discount starts from -1.5")
                      @DecimalMin(value = "-5.0", message = "Discount ends at -5.0")
                      @Negative(message = "Fee discount must be negative") Double discountPercentage
) {}