//
//  NGDMPicture.swift
//  NextGen
//
//  Created by Alec Ananian on 3/8/16.
//  Copyright © 2016 Warner Bros. Entertainment, Inc. All rights reserved.
//

import Foundation

// Wrapper class for `NGEPictureType` Manifest object
class NGDMPicture {
    
    // MARK: Instance Variables
    /// Unique identifier
    var id: String
    
    /// Image URL to be used for full display
    var imageURL: NSURL?
    
    /// Image URL to be used for thumbnail display
    var thumbnailImageURL: NSURL?
    
    // MARK: Initialization
    /**
        Initializes a new Picture
    
        - Parameters:
            - manifestObject: Raw Manifest data object
    */
    init(manifestObject: NGEPictureType) {
        id = manifestObject.PictureID
        
        if let id = manifestObject.ImageID {
            imageURL = NGDMImage.getById(id)?.url
        }
        
        if let id = manifestObject.ThumbnailImageID {
            thumbnailImageURL = NGDMImage.getById(id)?.url
        }
    }
    
    // MARK: Search Methods
    /**
        Find an `NGDMPicture` object by unique identifier
     
        - Parameters:
            - id: Unique identifier to search for
     
        - Returns: Object associated with identifier if it exists
     */
    static func getById(id: String) -> NGDMPicture? {
        return NextGenDataManager.sharedInstance.pictures[id]
    }
    
}