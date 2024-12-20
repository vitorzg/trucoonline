package dev.vitorzucon.trucoonline.domain.entities;

public record Player(
    String id,
    String nickname,
    String name,
    String password,
    String email,
    int wins,
    int loses
) {}
