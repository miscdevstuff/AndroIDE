# Project: AndroIDE
**Mission:** Build a Jetpack Compose on-device IDE for Android (API 28+, ARM64) that utilizes a PRoot Ubuntu backend.

## 1. STRICT GUARDRAILS (SECURITY & SCOPE)
* **Never leave the workspace:** You are strictly forbidden from accessing, reading, or modifying files outside the current project root.
* **Ignore Caches & Git:** Do NOT execute searches, reads, or modifications in `.git/`, `build/`, `.gradle/`, `.kotlin/`, or system caches (e.g., `~/.gradle`). 
* **No Speculative Execution:** Do not run `find`, `grep`, or `ls` commands on the broader file system to "understand the environment." Rely ONLY on the provided prompt context and the immediate project files.

## 2. TECH STACK & CONVENTIONS
* **UI:** Kotlin, Jetpack Compose, Material 3. Do not use XML layouts.
* **Build System:** Gradle Kotlin DSL (`build.gradle.kts`). Do not use Groovy (`build.gradle`).
* **Dependencies:** Managed strictly via `gradle/libs.versions.toml`. Do not hardcode dependencies in build scripts.
* **Architecture:** ARM64 (`arm64-v8a`) exclusively. 

## 3. AGENT WORKFLOW
* **One Step at a Time:** Only modify the specific files requested in the user prompt. Do not attempt to "finish the app" or write files related to future features.
* **No Hallucinated Tools:** If asked to implement a terminal or editor, rely ONLY on `Termux-app` and `Sora-Editor` libraries as configured.
* **Plan Before Code:** If a task is complex, output a brief bulleted plan of the files you intend to change before writing the code.
