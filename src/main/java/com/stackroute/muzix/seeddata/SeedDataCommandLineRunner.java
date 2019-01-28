//package com.stackroute.muzix.seeddata;
//
//
//import com.stackroute.muzix.domain.Track;
//import com.stackroute.muzix.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//    @Configuration
//    public class SeedDataCommandLineRunner implements CommandLineRunner {
//
//        private TrackRepository trackRepository;
//
//        @Autowired
//        public SeedDataCommandLineRunner(TrackRepository trackRepository)
//        {
//            this.trackRepository=trackRepository;
//        }
//        @Override
//        public void run(String... args) throws Exception {
//
//            Track track1 = Track.builder().trackName("leela").trackComments("IBM").build();
//            trackRepository.save(track1);
//
//
//        }
//    }
//
