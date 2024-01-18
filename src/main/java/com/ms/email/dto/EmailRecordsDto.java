package com.ms.email.dto;

import java.util.UUID;

public record EmailRecordsDto(UUID userId,
                              String emailTo,
                              String subject,
                              String text) {
}
