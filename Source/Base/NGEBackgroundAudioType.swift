import Foundation

#if (arch(i386) || arch(x86_64)) && os(iOS)
import libxmlSimu
#else
import libxml
#endif

@objc
class NGEBackgroundAudioType : NSObject{
    
    var `AudioTrackID`: String!
    
    var `EntryPointTimecode`: NGETimecodeType?
    
    var `ExitPointTimecode`: NGETimecodeType?
    
    var `LoopTimecode`: NGETimecodeType?
    
    func readAttributes(_ reader: xmlTextReaderPtr) {
        
    }
    
    init(_ reader: xmlTextReaderPtr) {
        let _complexTypeXmlDept = xmlTextReaderDepth(reader)
        super.init()
        
        self.readAttributes(reader)
        
        var _readerOk = xmlTextReaderRead(reader)
        var _currentNodeType = xmlTextReaderNodeType(reader)
        var _currentXmlDept = xmlTextReaderDepth(reader)
        
        while(_readerOk > 0 && _currentNodeType != 0/*XML_READER_TYPE_NONE*/ && _complexTypeXmlDept < _currentXmlDept) {
            var handledInChild = false
            if(_currentNodeType == 1/*XML_READER_TYPE_ELEMENT*/ || _currentNodeType == 3/*XML_READER_TYPE_TEXT*/) {
                if let _currentElementNameXmlChar = xmlTextReaderConstLocalName(reader) {
                    let _currentElementName = String(cString: _currentElementNameXmlChar)
                    if("AudioTrackID" == _currentElementName) {
                        
                        _readerOk = xmlTextReaderRead(reader)
                        _currentNodeType = xmlTextReaderNodeType(reader)
                        if let elementValue = xmlTextReaderConstValue(reader) {
                            
                            self.AudioTrackID = String(cString: elementValue)
                            
                        }
                        _readerOk = xmlTextReaderRead(reader)
                        _currentNodeType = xmlTextReaderNodeType(reader)
                        
                    } else if("EntryPointTimecode" == _currentElementName) {
                        
                        self.EntryPointTimecode = NGETimecodeType(reader)
                        handledInChild = true
                        
                    } else if("ExitPointTimecode" == _currentElementName) {
                        
                        self.ExitPointTimecode = NGETimecodeType(reader)
                        handledInChild = true
                        
                    } else if("LoopTimecode" == _currentElementName) {
                        
                        self.LoopTimecode = NGETimecodeType(reader)
                        handledInChild = true
                        
                    } else   if(true) {
                        print("Ignoring unexpected in NGEBackgroundAudioType: \(_currentElementName)")
                        if superclass != NSObject.self {
                            break
                        }
                    }
                }
            }
            _readerOk = handledInChild ? xmlTextReaderReadState(reader) : xmlTextReaderRead(reader)
            _currentNodeType = xmlTextReaderNodeType(reader)
            _currentXmlDept = xmlTextReaderDepth(reader)
        }
        
    }
    
    /*var dictionary: [String: AnyObject] {
        var dict = [String: AnyObject]()
        
        if(self.AudioTrackID != nil) {
            
            dict["AudioTrackID"] = self.AudioTrackID!
            
        }
        
        if(self.EntryPointTimecode != nil) {
            dict["EntryPointTimecode"] = self.EntryPointTimecode!
        }
        
        if(self.ExitPointTimecode != nil) {
            dict["ExitPointTimecode"] = self.ExitPointTimecode!
        }
        
        if(self.LoopTimecode != nil) {
            dict["LoopTimecode"] = self.LoopTimecode!
        }
        
        return dict
    }*/
    
}

