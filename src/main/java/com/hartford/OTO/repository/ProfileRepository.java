package com.hartford.OTO.repository;

import com.hartford.OTO.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
}
