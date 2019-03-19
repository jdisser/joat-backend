package com.altocirrusapps.apps.joatbackend.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface CalSchedulable {
	public boolean isOccuring(LocalDate date);
	public boolean isBetween(LocalDateTime from, LocalDateTime to);
	public LocalDateTime nextOccurance(LocalDateTime after);
}
