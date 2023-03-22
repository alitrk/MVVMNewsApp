package com.codinginflow.mvvmnewsapp.features.breakingnews

import androidx.lifecycle.ViewModel
import com.codinginflow.mvvmnewsapp.data.NewsRepository
import javax.inject.Inject

class BreakingNewsViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {
}