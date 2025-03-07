package pratheekv39.bridgelearn.io.domain.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import pratheekv39.bridgelearn.io.R
import pratheekv39.bridgelearn.io.data.models.ContentType
import pratheekv39.bridgelearn.io.data.models.LearnSubject
import pratheekv39.bridgelearn.io.data.models.LearningContent

class LearnViewModel : ViewModel() {
    private val _selectedSubject = MutableStateFlow<LearnSubject?>(null)
    val selectedSubject = _selectedSubject.asStateFlow()

    val subjects = listOf(
        LearnSubject(
            id = "physics",
            name = "Physics",
            description = "Learn about forces and energy",
            learningContent = listOf(
                LearningContent("1", "Introduction to Forces", ContentType.VIDEO, 0.8f),
                LearningContent("2", "Newton's Laws", ContentType.SIMULATION, 0.5f),
                LearningContent("3", "Energy Conservation", ContentType.READING, 0.3f),
                LearningContent("4", "Pendulum Simulator", ContentType.SIMULATION, 0.8f),
                LearningContent("5", "Spring Simulator", ContentType.SIMULATION, 0.8f)
            ),
            drawableResId = R.drawable.magnet_straight
        ),
        LearnSubject(
            id = "chemistry",
            name = "Chemistry",
            description = "Explore matter and reactions",
            learningContent = listOf(
                LearningContent("1", "Acids and Base Simulator", ContentType.SIMULATION, 0.6f),
                LearningContent("2", "Atomic Structure", ContentType.VIDEO, 0.6f),
                LearningContent("3", "Chemical Bonding", ContentType.SIMULATION, 0.4f),
                LearningContent("4", "Periodic Table", ContentType.READING, 0.2f)
            ),
            drawableResId = R.drawable.flask
        )
    )

    fun selectSubject(subject: LearnSubject) {
        _selectedSubject.value = subject
    }

    fun clearSelectedSubject() {
        _selectedSubject.value = null
    }
}