package com.example.designlayoutwork

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.designlayoutwork.readyScreenModel.Profile
import com.example.designlayoutwork.readyScreenModel.ProfilesRepository
import com.example.designlayoutwork.readyScreenModel.RecommendedUsersIcons
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivityViewModel(): ViewModel() {

    private val profilesRepository = ProfilesRepository()

    private val _currentProfile: MutableLiveData<Profile> = MutableLiveData<Profile>()
    val currentProfile: LiveData<Profile> = _currentProfile

    val recommendedUsersIcons = RecommendedUsersIcons()

    val isRunning = true

    init {
        viewModelScope.launch {
            var i = 0

            while(isRunning){
                if(i == profilesRepository.profiles.size) i=0
                _currentProfile.postValue(profilesRepository.profiles.get(i))
                i++
                delay(AppConstants.TIME_REFRESH_MS)
            }
        }
    }
}