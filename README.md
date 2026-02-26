A modern Google Play Store UI Replica built using Java in Android Studio to practice advanced UI development and RecyclerView concepts.
This project recreates the Play Store–style layout using nested RecyclerViews (Vertical + Horizontal scrolling sections).

Features:
Built using Java
Two RecyclerViews implementation
Vertical RecyclerView (Main Sections)
Horizontal RecyclerView (Apps inside each section)
Nested RecyclerView architecture
Clean Material UI
Smooth scrolling experience
Reusable Adapter pattern

Tech Stack:
Java
Android Studio
RecyclerView
CardView
ConstraintLayout
Material Design Components

What I Learned:
Implementing Nested RecyclerViews
Managing multiple Adapters
ViewHolder pattern optimization
Improving scrolling performance
Designing real-world UI replicas
Handling structured data models

Project Architecture:
MainActivity.java
│
├── SectionAdapter.java   (Vertical RecyclerView)
│
├── AppAdapter.java       (Horizontal RecyclerView)
│
├── SectionModel.java
├── AppModel.java
│
└── layout/
     ├── activity_main.xml
     ├── item_section.xml
     └── item_app.xml

Purpose of This Project:
Strengthen RecyclerView concepts
Practice complex UI layouts
Improve Java-based Android development skills
Prepare for Android Developer internships

Author:

Bakht Rasa
Android Developer (Java)
