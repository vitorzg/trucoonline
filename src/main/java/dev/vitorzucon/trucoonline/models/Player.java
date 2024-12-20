package dev.vitorzucon.trucoonline.models;

public record Player(
    String id,
    String nickname,
    String name,
    String password,
    String email,
    int wins,
    int loses
) {}
