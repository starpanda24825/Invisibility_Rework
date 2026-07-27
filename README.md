# Invisibility Rework

## Overview

This is a client-side Minecraft mod that changes what the **Invisibility** effect does visually, without removing or altering the effect itself.

In vanilla Minecraft, the Invisibility effect hides the entity model and nameplate from other players and mobs. This mod removes that visual suppression, so invisible players and mobs appear fully visible in-game. The effect tag remains on the entity untouched, which means third-party map plugins such as **BlueMap**, **DynMap**, and **Squaremap** — which detect player visibility by reading the Invisibility effect — will still correctly hide the player from the live map.

## Use Case

This mod was designed for a specific server scenario: servers that host live web maps (BlueMap, DynMap, Squaremap, etc.) where players can use the `/effect` command or Invisibility potions to hide themselves from the web map. Without this mod, those players also disappear from other players' screens in-game, which may not be the desired behavior. With this mod, map-hidden players remain visible in-game so that normal PvP/PvE interaction is preserved.

## Behavior Summary

- ✅ Entity model renders normally while invisible
- ✅ Nameplate renders normally while invisible
- ✅ Player is hidden from BlueMap / DynMap / Squaremap (via the untouched Invisibility effect tag)
- ❌ Does **NOT** remove or cancel the Invisibility effect
- ❌ Does **NOT** affect server-side invisibility logic

## Side

This is a **client-side only** mod. It does not need to be installed on the server, and installing it on a dedicated server has no effect (the mixins are registered under the `"client"` side only and will not load on a server).

## Compatibility

- Minecraft **1.21.1**
- NeoForge **21.1.244+**

## Installation

Standard Forge/NeoForge installation:

1. Install the NeoForge 1.21.1 mod loader for Minecraft 1.21.1.
2. Launch the game once so the `mods/` folder is generated.
3. Drop the `invisibilityrework-*.jar` file into your Minecraft `mods/` folder.
4. Launch the game again.
