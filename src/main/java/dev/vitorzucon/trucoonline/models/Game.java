package dev.vitorzucon.trucoonline.models;

import java.time.LocalDateTime;

public record Game(
    String id,
    LocalDateTime createAt,
    LocalDateTime finishedAt,
    Player player1,
    Player player2,
    Status status,
    int player1Score,
    int player2Score,
    String winnerID
) {}
