package com.stackroute.muzix.seeddata;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
    @Configuration
    public class SeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

        private TrackRepository trackRepository;
        @Autowired
        public SeedDataApplicationListener(TrackRepository trackRepository) {
            this.trackRepository = trackRepository;
        }    @Override
        public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
            Track track1=Track.builder().trackName("leela").trackComments("IBM").build();
            trackRepository.save(track1);
            //Track track2=Track.builder().trackName("Ani").trackComments("TCS").build();
           // trackRepository.save(track2);
        }
    }

