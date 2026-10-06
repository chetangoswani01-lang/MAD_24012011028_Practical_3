# Practical 3: Implicit and Explicit Intent

## Aim

Develop an Android application that demonstrates the working of **Implicit Intent** and **Explicit Intent**.

---

## Application Demo

|   |
| - |

### 🎥 Demo

demo_video.mp4 [video](https://private-user-images.githubusercontent.com/182553127/627941415-7f6118af-51a4-4e22-ae59-134f6b474d46.mp4?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3OTEyODM1NzMsIm5iZiI6MTc5MTI4MzI3MywicGF0aCI6Ii8xODI1NTMxMjcvNjI3OTQxNDE1LTdmNjExOGFmLTUxYTQtNGUyMi1hZTU5LTEzNGY2YjQ3NGQ0Ni5tcDQ_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotRGF0ZT0yMDI2MTAwNlQxMDQxMTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yM2FkMjA0NGM3NThjMDc1ZDYxMzNhMmRjNzNlOWY3OGI4ZmE0N2QwMDA5OWQ3NDE1ZDc2ZmMyYTZlMzFlMjM5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZyZXNwb25zZS1jb250ZW50LXR5cGU9dmlkZW8lMkZtcDQifQ.ZboATtjv0W4HkAs2F0RSjbRH2JRjIyB6FR6Sr1XGASQ)

|   |
| - |

### 📝 Steps

1. **Web Browsing**
2. **Phone Dialer**
3. **Call History**
4. **Gallery**
5. **Camera**
6. **Alarm Setting**
7. **Login Screen Navigation**

---

## Application Logic

### 1. Implicit Intent

Implicit Intent is used when the application needs to perform an operation without specifying a particular application or component to handle the request.

```kotlin
// Opening a URL in the browser
findViewById<Button>(R.id.btn_Browse).setOnClickListener {
    val url = findViewById<EditText>(R.id.editTextText).text.toString()
    Intent(Intent.ACTION_VIEW, url.toUri()).also {
        startActivity(it)
    }
}

// Opening the Dialer with a Phone Number
findViewById<Button>(R.id.btn_Call).setOnClickListener {
    val number = findViewById<EditText>(R.id.editTextText2).text.toString()
    Intent(Intent.ACTION_DIAL).apply {
        data = "tel:$number".toUri()
    }.also {
        startActivity(it)
    }
}
